package org.amos

class Complex(real: Double, imaginary: Double) {
def re =real
def im =imaginary

override def toString() = "I am a org.amos.Complex Number ("+re+"; "+im+")"
}
