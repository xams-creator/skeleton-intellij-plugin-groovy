package com.xams.intellij.plugin.skeleton.action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import icons.SdkIcons
import org.jetbrains.annotations.NotNull

class HelloWorldAction extends AnAction {

    @Override
    void actionPerformed(@NotNull AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT)
        event.getPresentation().setIcon(SdkIcons.Sdk_default_icon)
        Messages.showInfoMessage(project, "Hello Groovy!", "Hello World Action")
    }

}
