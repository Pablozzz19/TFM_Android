package com.cice.tfm_android.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import com.cice.tfm_android.databinding.ActivityRegisterBinding
import com.cice.tfm_android.utils.Utils

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

        val tilRegisterName = binding.tilRegisterName
        val tilRegisterLastName = binding.tilRegisterLastName
        val tilRegisterEmail = binding.tilRegisterEmail
        val tilRegisterPsw = binding.tilRegisterPsw
        val tilRepeatPsw = binding.tilRepeatPsw
        val listTextInputLayout = listOf(tilRegisterName, tilRegisterLastName, tilRegisterEmail, tilRegisterPsw, tilRepeatPsw)

        // Para el registro del usuario, hay que comprobar :
        // Que los campos no esten vacios.
        Utils().isEmptyTextInputLayout(listTextInputLayout)

        // Que el email sea correcto.
        val etEmail = binding.etRegisterEmail.text.toString()
        if (etEmail.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(etEmail).matches()) {
            // Set error text
            tilRegisterEmail.error = "wrongEmail"
        } else {
            // Clear error text
            tilRegisterEmail.error = null
        }

        // Que la password y confirm password sean el mismo.

    }

    private fun goToLoginActivity() {
        startActivity(Intent(this, LoginActivity::class.java))
    }
    // endregion
}