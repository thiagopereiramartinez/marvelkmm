package dev.thiagopereirati.marvelkmm.extensions

import java.math.BigInteger
import java.security.MessageDigest

val String.md5: String
    get() {
        val m = MessageDigest.getInstance("MD5")
        m.update(this.encodeToByteArray())
        return BigInteger(1, m.digest()).toString(16)
    }
