# Locker

## Section 1

### Requirement
- Save
- Pick up

### Tasking List

Task1: 

- Given: Locker has room
- When: Save Bag
- Then: Succeed, return ticket

Task2: 

- Given: Locker has room
- When: Save Bag
- Then: Succeed, return ticket

Task3: 

- Given: Locker has no room
- When: Save Bag
- Then: Failed, show failed message

Task4: 

- Given: Using valid ticket
- When: Pick up bag
- Then: Succeed, return bag

Task5: 

- Given: Using invalid ticket
- When: Pick up bag
- Then: Failed, show failed message

Task6: 

- Given: Using valid ticket
- When: Pick up bag twice
- Then: Succeed in the first time and failed in the second time. Show failed message

## Section 2
SmartLockerRobot

### Requirement
- SmartLockerRobot Save
- Pick up

### Tasking List

Task1: 

- Given: SmartLockerRobot manage Locker1 and Locker2, Locker1 has more room
- When: Save Bag
- Then: Locker1 Succeed, return ticket

Task2: 

- Given: SmartLockerRobot manage Locker1 and Locker2, Locker2 has more room
- When: Save Bag
- Then: Locker2 Succeed, return ticket

Task3: 

- Given: SmartLockerRobot manage Locker1 and Locker2, both Locker1 and Locker2 have the same room
- When: Save Bag
- Then: Locker1 Succeed, return ticket

Task4: 

- Given: SmartLockerRobot manage Locker1 and Locker2, bith Locker1 and Locker2 has no room
- When: Save Bag
- Then: Failed, return failed message

Task5: 

- Given: SmartLockerRobot manage Locker1 and Locker2, valid ticket and match locker
- When: pick up Bag
- Then: Succeed, return Bag

Task6: 

- Given: SmartLockerRobot manage Locker1 and Locker2, valid ticket and not match locker
- When: pick up Bag
- Then: Failed, return failed message

Task7: 

- Given: SmartLockerRobot manage Locker1 and Locker2, invalid ticket 
- When: pick up Bag
- Then: Failed, return failed message
