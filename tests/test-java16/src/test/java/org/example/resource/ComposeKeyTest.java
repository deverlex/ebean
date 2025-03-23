package org.example.resource;

import org.example.records.Customer;
import org.example.records.PartitionKey;
import org.example.records.RContact;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author ng.do@zobabb.com
 * @copyright (c) 2025
 * @created 23/Mar
 */

public class ComposeKeyTest {

  @Test
  void saveEntityWithComposeKey() {
    RContact contact = new RContact();
    PartitionKey partitionKey = new PartitionKey(1L, null);
    contact.setPartitionKey(partitionKey);
    contact.save();
    assertNotNull(contact);
  }

  @Test
  void saveEntityWithoutComposeKey() {
    Customer customer = new Customer();
    customer.save();
    assertNotNull(customer.getId());
  }
}
