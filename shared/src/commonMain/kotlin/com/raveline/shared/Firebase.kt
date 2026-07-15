package com.raveline.shared

import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.auth.auth
import dev.gitlive.firebase.initialize

object FirebaseStore {
    fun initialize(context: Any){
        Firebase.initialize(context)
    }
    val auth get() = Firebase.auth
}
