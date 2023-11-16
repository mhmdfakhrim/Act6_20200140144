package com.example.formrasa

import androidx.lifecycle.ViewModel
import com.example.formrasa.data.ContactUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ContactViewModel : ViewModel() {
    private val _stateUIForm = MutableStateFlow(ContactUIState())
    val stateUIForm: StateFlow<ContactUIState> = _stateUIForm.asStateFlow()

    fun setContact(listData: MutableList<String>){
        _stateUIForm.update{ stateSaatIni ->
            stateSaatIni.copy(
                nama = listData[0],
                alamat = listData[1],
                noTelp = listData[2]
            )
        }
    }
}