package com.cice.tfm_android.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import com.cice.tfm_android.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    // region - Global Variables
    private lateinit var binding: ActivityLoginBinding
    // endregion

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignIn.setOnClickListener {
            addingErrorsTextField()
        }

    }

    // region - Private Methods
    private fun addingErrorsTextField() {

        val etEmail = binding.etLoginEmail.text.toString()
        val etPsw = binding.etLoginPsw.text.toString()

        when {
            etEmail.isEmpty() -> {
                // Set error text
                binding.tilLoginEmail.error = "isEmpty"
            }
            !Patterns.EMAIL_ADDRESS.matcher(etEmail).matches() -> {
                // Set error text
                binding.tilLoginEmail.error = "wrongEmail"
            }
            else -> {
                // Clear error text
                binding.tilLoginEmail.error = null
            }
        }

        if (etPsw != null) {
            if (etPsw.isEmpty()) {
                // Set error text
                binding.tilLoginPsw.error = "isEmpty"
            }
            else {
                // Clear error text
                binding.tilLoginPsw.error = null
            }
        }
    }
    // endregion
}