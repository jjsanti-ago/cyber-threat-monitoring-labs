# Basic Port Scanner 🔎

A simple Java-based port scanner developed as a cybersecurity and networking learning project.

## Project Overview

This project checks whether selected TCP ports on a specified host are reachable.

The scanner attempts to establish a connection to each selected port and reports whether the port is open or closed.

The project is intended for educational purposes and authorized testing only.

## How It Works

The scanner follows these basic steps:

1. Accepts a target hostname or IP address.
2. Checks a predefined list of TCP ports.
3. Attempts to establish a connection to each port.
4. Reports the connection status.
5. Displays the scan results.

## Example

```text
Basic Port Scanner
------------------

Target: 127.0.0.1

Port 80   → CLOSED
Port 443  → CLOSED
Port 8080 → OPEN

Scan completed.

```
## Testing

The application can be tested using localhost (127.0.0.1) or another system that the user is authorized to scan.

Example test:
Target: 127.0.0.1

Port 80   → CLOSED
Port 443  → CLOSED
Port 8080 → OPEN

The results depend on which services are currently running on the target system.

## Security Considerations

This project is intended for educational and authorized security testing only.

Port scanning should only be performed against systems that you own or have explicit permission to test.

The application does not attempt to exploit discovered services or vulnerabilities.

## Technologies
- Java
- Java Networking
- TCP Connections
- Console Input and Output
  
## Learning Objectives

Through this project, I aim to strengthen my understanding of:

- Java programming fundamentals
- Network communication
- TCP ports
- Socket connections
- Hostnames and IP addresses
- Basic network reconnaissance concepts
- Input validation
- Security testing principles

## Career Relevance

This project demonstrates the application of Java programming and networking fundamentals to a basic cybersecurity task.

It supports my learning path toward IT Support, Network Support, Cybersecurity, Security Operations, and SOC Analysis.
