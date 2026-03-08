# MonsterEvolutionPlugin

*Author:* DevRaven  
*Version:* 1.0  

MonsterEvolutionPlugin is a dynamic gameplay plugin where monsters evolve based on how players fight them.  
Instead of static enemies, the world becomes more dangerous as creatures adapt to player strategies.

---

## 🧬 Concept

In many sandbox games, monsters always behave the same way.  
MonsterEvolutionPlugin changes that.

Creatures learn from player behavior. If players repeatedly use certain weapons or damage types, monsters evolve resistances and mutations to survive.

This creates a living ecosystem where players must constantly adapt their combat style.

---

## ⚔️ Features

### Adaptive Monster Evolution
Monsters evolve depending on how they are killed.

Examples:
- Frequent sword kills → monsters gain *melee resistance*
- Frequent bow kills → monsters gain *projectile resistance*
- Frequent fire kills → monsters gain *fire immunity*

---

### Mutation Unlock System
When certain thresholds are reached, new mutations activate.

Possible mutations include:

- *Melee Resistance* – reduces sword damage
- *Projectile Resistance* – reduces arrow damage
- *Fire Immunity* – prevents fire damage

---

### Global Evolution Tracking
The plugin tracks how monsters die across the entire world.  
All newly spawned monsters will adapt to these statistics.

---

### Dynamic Difficulty
The more players fight monsters using the same strategy, the harder monsters become.  
Players must change tactics to survive.

---

### Configurable Evolution

Server owners can change evolution requirements inside config.yml.

Example:

yaml
swordKillsRequired: 50
bowKillsRequired: 50
fireKillsRequired: 50


---

## 📁 Plugin Structure


MonsterEvolutionPlugin
│
├── MainPlugin.java
├── EvolutionManager.java
├── MonsterStats.java
├── MutationSystem.java
└── config.yml


---

## 🚀 Future Features (Planned)

- Visible monster mutations
- Regional evolution by biome
- Mutated boss monsters
- Evolution levels
- Custom mutation effects

---

## 👨‍💻 Author

Developed by *DevRaven*

---

## 📜 License

Free to use and modify.  
Please credit the original author when sharing the plugin.
