package com.cice.tfm_android.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cice.tfm_android.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    // region - Global Variables
    private lateinit var binding: ActivityRegisterBinding
    // endregion

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignUp.setOnClickListener {
            addingErrorsTextField()
        }

        binding.tvSignIn.setOnClickListener {
            goToLoginActivity()
        }
    }

    // region - Private Methods
    private fun addingErrorsTextField() {

        val etRegisterName = binding.etRegisterName.text.toString()

        if (etRegisterName.trim().isEmpty()) {
            // Set error text
            binding.etRegisterName.error = "isEmpty"
        } else {
            // Clear error text
            binding.etRegisterName.error = null
        }
    }

    private fun goToLoginActivity() {
        startActivity(Intent(this, LoginActivity::class.java))
    }
    // endregion
}