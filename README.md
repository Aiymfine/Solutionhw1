This repo has two real-world examples of design patterns I used in Java:
- Flyweight Pattern
- Proxy Pattern

  1. Flyweight pattern-Map Markers
problem:
Let’s say we have many map markers (like for hospitals, restaurants, gas stations), and some of them use the same color and icon. Without optimization, every marker would store the same style info, which wastes memory.

advantage:
I separated the shared style info (icon + color) into a `MarkerStyle` class. Then I used a factory to reuse those style objects instead of creating new ones every time. So, we create less objects and save memory.

2. Proxy Pattern–Real Estate Image Upload
problem:
Only logged in users should be able to upload property images. But if we give direct access, then even unauthenticated users could use the app.

advantage:
I made a proxy class called `AuthProxy` that checks if the user is logged in before allowing them to upload or view full images. It acts like a gatekeeper and keeps things secure and efficient.
