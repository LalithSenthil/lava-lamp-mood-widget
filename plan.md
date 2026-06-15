Project Overview
Project Name: Lava Lamp Mood Widget
Goal: Create a modern, frameless, transparent JavaFX desktop widget that displays smoothly animated lava-lamp-style blobs drifting across the screen. The widget serves as a visual desktop accessory rather than a traditional application window.
Colors transition dynamically based on time of day and react subtly to mouse proximity. Users can customize animation behavior, color palettes, transparency, glow intensity, interaction strength, and optional ambient audio.
The application will be built entirely with JavaFX using procedural UI creation (no FXML) and will utilize a Canvas-based rendering pipeline powered by AnimationTimer for high-performance real-time animation.
Development Strategy
To ensure a stable and maintainable application, the project will be implemented incrementally rather than generating all classes simultaneously.
Each milestone must compile and run successfully before proceeding to the next phase.
The initial implementation will focus on creating a stable rendering pipeline using JavaFX Canvas and AnimationTimer. Advanced features such as metaball blending, particle systems, procedural audio generation, and blob merging will be introduced only after the baseline widget is operational.
This approach minimizes debugging complexity, prevents dependency issues between classes, and ensures a working application is available at every stage of development.
High-Level Architecture
Presentation Layer
Responsible for window creation, transparency, settings UI, user interaction, and application lifecycle.
Components:
MainApp
WidgetWindow
WidgetController
SettingsController
Rendering Layer
Responsible for all visual output and frame rendering.
Components:
CanvasRenderer
Renderer Interface
Simulation Layer
Responsible for blob movement, physics, and animation updates.
Components:
Blob
SimulationManager
AnimationManager
Color & Theme Layer
Responsible for palette management and time-based visual transitions.
Components:
ColorProvider
TimeColorProvider
PaletteManager
Input Layer
Responsible for mouse tracking and widget dragging.
Components:
MouseTracker
Persistence Layer
Responsible for storing and restoring user preferences.
Components:
PreferencesService
Effects Layer
Responsible for visual polish features.
Components:
Particle
VisualEffectsManager
Advanced Layer (Stretch Goals)
Responsible for complex fluid simulation behavior.
Components:
MorphEngine
Directory Structure
src/
├── main/
│   ├── java/
│   │   └── com/example/lavalamp/
│   │       ├── MainApp.java
│   │       ├── ui/
│   │       │   ├── WidgetWindow.java
│   │       │   ├── WidgetController.java
│   │       │   └── SettingsController.java
│   │       ├── core/
│   │       │   ├── Blob.java
│   │       │   ├── SimulationManager.java
│   │       │   └── AnimationManager.java
│   │       ├── render/
│   │       │   ├── Renderer.java
│   │       │   └── CanvasRenderer.java
│   │       ├── services/
│   │       │   ├── ColorProvider.java
│   │       │   ├── TimeColorProvider.java
│   │       │   ├── PaletteManager.java
│   │       │   └── PreferencesService.java
│   │       ├── input/
│   │       │   └── MouseTracker.java
│   │       ├── effects/
│   │       │   ├── Particle.java
│   │       │   └── VisualEffectsManager.java
│   │       ├── advanced/
│   │       │   └── MorphEngine.java
│   │       └── util/
│   │           ├── FXUtils.java
│   │           └── MathUtils.java
│   │
│   └── resources/
│       ├── styles/
│       │   └── styles.css
│       └── config/
│           └── default.properties
│
└── test/
    └── java/
Class Responsibilities
MainApp
Responsibilities:
JavaFX Application entry point
Application startup
Initialize WidgetWindow
Configure application lifecycle
WidgetWindow
Responsibilities:
Transparent frameless Stage
Window dragging
Always-on-top support
Create root Scene
Attach renderer and simulation systems
Key Configuration:
stage.initStyle(StageStyle.TRANSPARENT);
scene.setFill(Color.TRANSPARENT);
AnimationManager
Responsibilities:
Manage AnimationTimer
Calculate delta time
Maintain frame timing
Notify simulation and renderer
Methods:
start()
stop()
setTargetFps(int fps)
Blob
Responsibilities:
Store position and velocity
Radius and animation properties
Movement updates
Fields:
position
velocity
radius
color
SimulationManager
Responsibilities:
Manage active blobs
Update positions
Handle movement forces
Provide render state
Methods:
update(double dt)
getBlobs()
CanvasRenderer
Responsibilities:
Draw blobs onto Canvas
Clear frame buffer
Render glow effects
Handle resizing
Methods:
renderFrame()
resize()
MouseTracker
Responsibilities:
Track cursor location
Calculate proximity strength
Support blob attraction/repulsion
Methods:
getMousePosition()
getInteractionStrength()
ColorProvider
Responsibilities:
Supply active colors
Manage interpolation
TimeColorProvider
Responsibilities:
Time-of-day palette selection
Smooth transitions
Palettes:
Dawn
Day
Sunset
Night
PaletteManager
Responsibilities:
Store custom palettes
Switch active themes
Interpolate between palettes
SettingsController
Responsibilities:
Provide controls for:
Blob count
Animation speed
Transparency
Glow intensity
Interaction strength
Always-on-top
Settings update in real time.
PreferencesService
Responsibilities:
Save user preferences
Restore settings on startup
Technology:
java.util.prefs.Preferences
Particle
Responsibilities:
Decorative visual effects
Bubble particles
Trails
Fading animations
VisualEffectsManager
Responsibilities:
Glow rendering
Trail effects
Visual polish
Implemented only after the baseline widget is stable.
MorphEngine (Optional Stretch Goal)
Responsibilities:
Blob merging
Blob splitting
Metaball rendering
Fluid simulation
This class should only be implemented after all core features are complete.
Rendering Strategy
Phase 1 Rendering
The initial implementation should render blobs as animated radial-gradient circles drawn directly onto a JavaFX Canvas.
Benefits:
Simple implementation
Excellent performance
Easy debugging
Stable rendering pipeline
Phase 2 Rendering
Enhance visuals using:
Glow effects
Layered gradients
Soft transparency
Particle trails
Phase 3 Rendering (Stretch Goal)
Advanced rendering techniques:
Metaball blending
Blob merging
Fluid-like morphing
Organic shape deformation
Interaction Design
Window Dragging
User can reposition the widget by dragging anywhere on the widget surface.
Implementation:
setOnMousePressed(...)
setOnMouseDragged(...)
Mouse Proximity Effects
Cursor movement subtly influences blob motion.
Possible modes:
Attraction
Repulsion
Distortion
Effects should remain gentle and ambient.
Always-On-Top Support
User option:
stage.setAlwaysOnTop(true);
Preference persists between launches.
Time-Based Color System
The widget automatically transitions between palettes.
Dawn
Soft orange
Pink
Warm gold
Day
Blue
Cyan
White
Sunset
Orange
Purple
Red
Night
Deep purple
Indigo
Navy
Transitions should be smooth and continuous.
Procedural Audio Support
Audio functionality will be implemented after the core widget is complete.
Future AudioManager capabilities:
Ambient hum
Soft pulse
Calm drone
Palette-linked tones
Implementation:
javax.sound.sampled
No external audio files required.
Audio remains optional and disabled by default.
Performance Requirements
The application should:
Maintain approximately 60 FPS
Use a single Canvas for rendering
Minimize Scene Graph complexity
Avoid unnecessary object allocation
Use delta-time updates
Maintain low CPU usage while idle
Maven Configuration
Use:
org.openjfx:javafx-maven-plugin
Development command:
mvn clean javafx:run
Zulu JDK 25 is already installed, so Maven should use the local Java installation during development.
Testing Plan
Unit Tests
MathUtilsTest
Interpolation
Easing
Random helpers
SimulationManagerTest
Blob updates
Delta-time stability
Performance checks
Manual Tests
Verify:
Transparent window
Dragging behavior
Always-on-top toggle
Settings persistence
Color transitions
Stable frame rate
Milestone Roadmap
Milestone 1 - Baseline Widget Architecture
Create:
MainApp
WidgetWindow
CanvasRenderer
AnimationManager
Blob
SimulationManager
Features:
Transparent Stage
Draggable window
AnimationTimer loop
10 animated blobs
Success Criteria:
Application launches and renders smoothly.
Milestone 2 - User Interaction
Create:
MouseTracker
Features:
Mouse influence on blobs
Adjustable interaction strength
Milestone 3 — Dynamic Color System
Create:
ColorProvider
TimeColorProvider
PaletteManager
Features:
Time-based palette transitions
Milestone 4 — Settings & Persistence
Create:
SettingsController
PreferencesService
Features:
Real-time controls
Persistent settings
Milestone 5 — Visual Effects
Create:
Particle
VisualEffectsManager
Features:
Glow
Trails
Visual polish
AI Generation Requirements
When generating code from this plan:
Implement one milestone at a time.
Ensure the project compiles after every milestone.
Do not generate placeholder classes that are not currently required.
Prefer working functionality over architectural completeness.
Maintain a runnable application throughout development.
Verify all imports, package names, and Maven configuration before proceeding.
The primary objective is a polished, visually impressive, stable desktop widget rather than a complex but incomplete simulation.

