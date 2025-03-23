package org.example.records;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;

import java.util.Objects;

/**
 * @author ng.do@zobabb.com
 * @copyright (c) 2025
 * @created 23/Mar
 */
@Embeddable
public class PartitionKey {
  @Column(name = "org_id")
  private Long orgId;
  @GeneratedValue
  @Column(name = "id")
  private Long id;

  public PartitionKey() {}

  public PartitionKey(Long orgId, Long id) {
    this.orgId = orgId;
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PartitionKey that = (PartitionKey) o;
    return Objects.equals(orgId, that.orgId) && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgId, id);
  }

  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
