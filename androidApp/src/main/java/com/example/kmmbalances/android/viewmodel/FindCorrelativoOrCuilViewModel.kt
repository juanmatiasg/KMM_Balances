package com.example.kmmbalances.android.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kmmbalances.domain.model.Busqueda
import com.example.kmmbalances.domain.usecases.GetFindCorrelativoOrCuilUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class FindCorrelativoOrCuilViewModel(private val useCase: GetFindCorrelativoOrCuilUseCase):ViewModel() {
    private val _findCorrelativoOrCuil = MutableStateFlow<Busqueda?>(null)
    val findCorrelativoOrCuil: StateFlow<Busqueda?> = _findCorrelativoOrCuil

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading

    private val _error = MutableStateFlow<String?>(null)
    val error: StateFlow<String?> = _error

    fun fetchFindCorrelativoOrCuil(correlativo:String){
        viewModelScope.launch(Dispatchers.IO) {
            _isLoading.value = true
            _error.value = null
            try {
                _findCorrelativoOrCuil.value = useCase.getCuilOrCorrelativo(correlativo)
            } catch (e: Exception) {
                _error.value = e.message
            } finally {
                _isLoading.value = false
            }
        }
    }
}