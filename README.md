# EQL-server
## 👥 Team
<table>
  <tbody>
    <tr>
      <td align="center"><a href=""><img src="https://avatars.githubusercontent.com/u/84304802?v=4" width="100px;" alt=""/><br /><sub><b>최승준</b></sub></a><br/></td>
      <td align="center"><a href=""><img src="https://avatars.githubusercontent.com/u/128011308?v=4" width="100px;" alt=""/><br /><sub><b>김보람</b></sub></a><br/></td>
    </tr>
  </tbody>
</table>

<br>

---

## 📁 Package Structure
```
\---server
    \---eqlserver
        +---api
        |   +---cart
        |   |   \---dto
        |   |       +---request
        |   |       \---response
        |   +---content
        |   |   \---dto
        |   +---item
        |   |   \---dto
        |   |       \---response
        |   +---member
        |   |   \---dto
        |   |       \---response
        |   \---order
        |       \---dto
        |           \---response
        +---common
        |   \---dto
        +---domain
        |   \---common
        +---global
        |   +---config
        |   \---exception
        +---repository
        \---service
            +---cart
            +---content
            +---item
            +---member
            \---order
```

<br>

---

## 📋 Entity Relational Diagram

![스크린샷 2023-11-22 오전 2 01 07](https://github.com/DO-SOPT-CDS-5/EQL-server/assets/84304802/e53feab3-537e-42e5-914f-4104f2501a60)

<br>

---

## 🗺️ Architecture

![EQL](https://github.com/DO-SOPT-CDS-5/EQL-server/assets/84304802/a3c532ec-a9fc-49a1-ac7e-7da3a2902d53)

<br>

---

## 📋 API Docs
https://pgmjun.notion.site/API-6146ec26b9ea4d0abecda4bf9a07e996?pvs=4

<br>

---

## 🛠️ Used Tech
- SpringBoot 3.x
- Java 17
- JPA
  
### DB
- MySQL 8.0

### Infra
- AWS EC2
- AWS RDS
- AWS IAM

### Local
- Docker

