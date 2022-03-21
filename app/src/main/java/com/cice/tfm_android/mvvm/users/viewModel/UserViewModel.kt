package com.cice.tfm_android.mvvm.users.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cice.tfm_android.mvvm.users.model.UserModel

class UserViewModel : ViewModel() {

    val userModel = MutableLiveData<UserModel>()

}