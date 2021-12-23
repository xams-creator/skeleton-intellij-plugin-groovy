package com.xams.intellij.plugin.skeleton.action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import org.jetbrains.annotations.NotNull

class ConfirmDialogAction extends AnAction {

    @Override
    void actionPerformed(@NotNull AnActionEvent event) {
        Project project = event.getData(PlatformDataKeys.PROJECT)

        int value = Messages.showYesNoDialog(
            project,
            "Yes Or No?",
            "Confirm Result",
            Messages.getQuestionIcon()
        )
        if (!isYES(value)) {
            Messages.showErrorDialog(project, "NO", "Confirm Result")
            return
        }
        Messages.showInfoMessage(project, "YES", "Confirm Result")
    }

    static boolean isYES(int value) {
        return value == Messages.YES
    }

}
