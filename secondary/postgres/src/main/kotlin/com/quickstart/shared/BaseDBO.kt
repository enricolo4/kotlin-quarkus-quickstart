package com.quickstart.shared

import io.hypersistence.utils.hibernate.id.Tsid
import jakarta.persistence.Column
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import java.time.LocalDateTime
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp

@MappedSuperclass
abstract class BaseDBO {
    @Id
    @Tsid
    @Column
    var id: Long? = null

    @CreationTimestamp
    lateinit var createdAt: LocalDateTime

    @UpdateTimestamp
    var modifiedAt: LocalDateTime? = null
}