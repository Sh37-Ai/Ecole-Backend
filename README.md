# 🎓 Ecole - Backend (Spring Boot + PostgreSQL + JWT)

Ce dépôt contient la partie **backend** du projet de gestion d'école.
Il s'agit d'une application **Spring Boot** connectée à une base de données **PostgreSQL**, intégrant une **authentification sécurisée avec JWT** et une **gestion des rôles utilisateurs (professeur / visiteur)**.

---

## 🚀 Fonctionnalités principales

- 🔐 **Authentification & Autorisation JWT**
  - Génération et validation de tokens JWT
  - Accès restreint selon le rôle utilisateur
- 👩‍🏫 **Gestion des professeurs**
  - Création, modification, suppression, et consultation des comptes
- 👀 **Accès visiteur**
  - Consultation publique de certaines ressources
- 🧩 **API RESTful**
  - Architecture claire et conforme aux bonnes pratiques REST
- 🗃️ **Persistance avec PostgreSQL**
  - Gestion des entités via Hibernate / JPA
- ⚙️ **Sécurité Spring Security**
  - Filtrage des requêtes par token et configuration personnalisée

---

## 🧠 Objectif du projet

Ce projet a pour but de démontrer la conception d’un **backend web sécurisé et modulaire**.
Il met en œuvre les bonnes pratiques de développement :
- Séparation claire entre couches (`controller`, `service`, `repository`)
- Sécurité moderne avec JWT
- Utilisation de PostgreSQL pour la persistance
- Documentation claire et code maintenable

---

## 🧰 Stack technique

| Technologie | Description |
|--------------|-------------|
| **Java 17** | Langage principal |
| **Spring Boot 3** | Framework backend |
| **Spring Security + JWT** | Authentification et autorisation |
| **JPA / Hibernate** | Gestion ORM |
| **PostgreSQL** | Base de données relationnelle |
| **Maven** | Gestionnaire de dépendances |
| **REST API** | Communication avec le frontend |

---

## ⚙️ Installation et exécution

### 🧾 Prérequis
- Java 17 ou plus
- Maven
- PostgreSQL (port 5432)
- Un IDE (IntelliJ, Eclipse, VS Code)

---

### 🔧 Étapes d’installation

```bash
# 1️⃣ Cloner le projet
git clone https://github.com/Sh37-Ai/Ecole-Backend.git
cd Ecole-Backend

# 2️⃣ Configurer la base de données PostgreSQL
# Crée une base de données (par ex. "ecole") sur PostgreSQL
# et mets à jour les informations dans application.properties
