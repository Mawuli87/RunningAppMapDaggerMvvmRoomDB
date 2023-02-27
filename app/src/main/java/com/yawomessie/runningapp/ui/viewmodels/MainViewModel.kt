package com.yawomessie.runningapp.ui.viewmodels


import androidx.lifecycle.ViewModel
import com.yawomessie.runningapp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val mainRepository: MainRepository
): ViewModel() {
}