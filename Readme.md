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


##section2
SmartLockerRobot
Given SmartLockerRobot管理柜子1和柜子2，柜子1的剩余容量多，when 存物品，then 存柜子1，成功出票
Given SmartLockerRobot管理柜子1和柜子2，柜子2的剩余容量多，when 存物品，then 存柜子2，成功出票
Given SmartLockerRobot管理柜子1和柜子2，柜子1和柜子2容量一样，when 存物品，then 存柜子1，成功出票
Given SmartLockerRobot管理柜子1和柜子2，柜子1和柜子2都满了，when 存物品，then 存失败
Given SmartLockerRobot管理柜子1和柜子2，有效票，when 取物品，then 取成功
Given SmartLockerRobot管理柜子1和柜子2，无效票，when 取物品，then 取失败
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