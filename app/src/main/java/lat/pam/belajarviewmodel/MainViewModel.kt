package lat.pam.belajarviewmodel

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var angka = 0
    fun tamabahAngka(){
        angka++
    }
}