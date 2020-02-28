package org.jetbrains.kotlin.tools.projectWizard.wizard.ui.components

import com.intellij.ui.components.JBCheckBox
import org.jetbrains.kotlin.tools.projectWizard.core.context.ReadingContext
import org.jetbrains.kotlin.tools.projectWizard.core.entity.SettingValidator
import org.jetbrains.kotlin.tools.projectWizard.wizard.IdeContext

class CheckboxComponent(
    ideContext: IdeContext,
    labelText: String? = null,
    initialValue: Boolean? = null,
    validator: SettingValidator<Boolean>? = null,
    onValueUpdate: (Boolean) -> Unit = {}
) : UIComponent<Boolean>(
    ideContext,
    labelText,
    validator,
    onValueUpdate
) {
    override val uiComponent: JBCheckBox = JBCheckBox(labelText, initialValue ?: false).apply {
        addChangeListener {
            fireValueUpdated(this@apply.isSelected)
        }
    }

    override fun updateUiValue(newValue: Boolean) = safeUpdateUi {
        uiComponent.isSelected = newValue
    }

    override fun getUiValue(): Boolean = uiComponent.isSelected
}