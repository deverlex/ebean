package org.example.records;

import io.ebean.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author ng.do@zobabb.com
 * @copyright (c) 2025
 * @created 23/Mar
 */
@Entity
@Table(name = "customers")
public class Customer extends Model {
  @Id
  @GeneratedValue
  private Long id;

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }
}
