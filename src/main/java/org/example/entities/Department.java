package org.example.entities;


import javax.persistence.*;
import java.util.List;

@Entity
public class Department{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;

        public Department(Long id, String name) {
                this.id = id;
                this.name = name;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public Department() {
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }



}