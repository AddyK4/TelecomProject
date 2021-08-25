package com.example.telecom.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.telecom.beans.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer>{

}
