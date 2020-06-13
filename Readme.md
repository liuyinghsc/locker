# Locker

## Section 1

### Requirement
- Save
- Pick up

### Tasking List
- Given: Locker has room
- When: Save Bag
- Then: Succeed, return ticket

- Given: Locker has no room
- When: Save Bag
- Then: Failed, show failed message

- Given: Using valid ticket
- When: Pick up bag
- Then: Succeed, return bag

- Given: Using invalid ticket
- When: Pick up bag
- Then: Failed, show failed message

- Given: Using valid ticket
- When: Pick up bag twice
- Then: Succeed in the first time and failed in the second time. Show failed message
