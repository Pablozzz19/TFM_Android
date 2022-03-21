package com.cice.tfm_android.utils

import com.google.android.material.textfield.TextInputLayout

class Utils {

    // region - Global Methods
    fun isEmptyTextInputLayout(listTextField : List<TextInputLayout>) {
        listTextField.forEach {
            if (it.editText?.text.toString().trim().isEmpty()) {
                it.error = "isEmpty"
            } else {
                it.error = null
            }
        }
    }
    // endregion

}