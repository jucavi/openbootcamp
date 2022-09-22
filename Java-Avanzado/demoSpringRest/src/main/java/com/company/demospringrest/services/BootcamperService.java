package com.company.demospringrest.services;


import com.company.demospringrest.models.Bootcamper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BootcamperService {

    private ArrayList<Bootcamper> bootcampers = new ArrayList<Bootcamper>();

    public ArrayList<Bootcamper> getAll() {
        return this.bootcampers;
    }

    public void add(Bootcamper bootcamper) {
        this.bootcampers.add(bootcamper);
    }

    public Bootcamper getBootcamper(String name) {
        for (Bootcamper bcamper : bootcampers) {
            if (bcamper.getName().equalsIgnoreCase(name)) {
                return bcamper;
            }
        }
        return null;
    }
}
