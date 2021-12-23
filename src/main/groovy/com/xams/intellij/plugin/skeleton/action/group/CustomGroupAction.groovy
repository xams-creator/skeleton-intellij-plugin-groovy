package com.xams.intellij.plugin.skeleton.action.group

import com.intellij.notification.*
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import icons.SdkIcons
import org.jetbrains.annotations.NotNull

import javax.swing.Icon

class CustomGroupAction extends AnAction {

    private NotificationGroup group


    CustomGroupAction(String text, String description, Icon icon) {
        super(text, description, icon)

        // 右下角触发通知，BALLOON 自动消失，event log 记录日志
        this.group = new NotificationGroup(
            "customGroup", NotificationDisplayType.BALLOON, true
        );
    }

    @Override
    void actionPerformed(@NotNull AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT)
        event.getPresentation().setIcon(SdkIcons.Sdk_default_icon)

        Notifications.Bus.notify(
            this.group.createNotification("notification", NotificationType.INFORMATION),
            project
        )
    }


}
