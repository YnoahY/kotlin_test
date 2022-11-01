package classAndConstructor

class Patient1(val name: String, var id: Int) {
    fun doctorList(d: Doctor) {
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor1(val name: String, val p: Patient) {

    val customerId: Int = p.id

    fun patientList() {
        println("Doctor: $name, Patient: ${p.name}")
        println("Patient Id: $customerId")
    }
}

fun main() {
    val patient1 = Patient1("kildong", 1234)
    val doc1 = Doctor("kimsabu", patient1)
    doc1.patientList()
}