package com.mzr.liqubase3881reproduce

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Student(@Id var id: Long, var firstName: String, var lastName: String)