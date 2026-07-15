package com.raveline.shared

import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.auth.auth

object FirebaseStore {
    val auth get() = Firebase.auth
}
