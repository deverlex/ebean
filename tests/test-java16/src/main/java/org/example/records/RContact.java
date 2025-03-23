package org.example.records;

import io.ebean.Model;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * @author ng.do@zobabb.com
 * @copyright (c) 2025
 * @created 23/Mar
 */
@Entity
@Table(name = "contacts")
public class RContact extends Model {
  @EmbeddedId
  private PartitionKey partitionKey;

  public void setPartitionKey(PartitionKey partitionKey) {
    this.partitionKey = partitionKey;
  }

  public PartitionKey getPartitionKey() {
    return partitionKey;
  }
}
