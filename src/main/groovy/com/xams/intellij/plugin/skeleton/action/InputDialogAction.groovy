package com.xams.intellij.plugin.skeleton.action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import icons.SdkIcons
import org.jetbrains.annotations.NotNull

class InputDialogAction extends AnAction {

    @Override
    void actionPerformed(@NotNull AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT)

        String value = Messages.showInputDialog(
            project,
            "What is your name?",
            "Input Your Name",
            Messages.getQuestionIcon());
        if (value) {
            Messages.showInfoMessage(project, value, "Your Name");
        }
    }

}
