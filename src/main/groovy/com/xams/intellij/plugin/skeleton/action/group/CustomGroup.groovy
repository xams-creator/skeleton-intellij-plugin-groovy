package com.xams.intellij.plugin.skeleton.action.group

import com.intellij.openapi.actionSystem.ActionGroup
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import icons.SdkIcons
import org.jetbrains.annotations.Nullable

class CustomGroup extends ActionGroup {

    @Override
    AnAction[] getChildren(@Nullable AnActionEvent event) {
        return [
            new CustomGroupAction(
                "Custom Action",
                "Custom Action!",
                SdkIcons.Sdk_default_icon
            )
        ]
    }

}
