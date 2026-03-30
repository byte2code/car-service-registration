# Changelog

All notable changes to this project are documented in this file.

## [v3.0.0] - 2026-03-30

### Summary
Third version of the Car Service Registration project that extends the registration flow with a success-to-support handoff while keeping the layered Spring MVC structure intact.

### Highlights

- Added a support page and controller for post-registration follow-up.
- Updated the success flow to redirect with the generated registration ID.
- Displayed the registration ID on the success page and linked it to support.
- Added controller tests for the new success redirect and support page behavior.
- Refreshed the README to present the project as a clean learning showcase.

### Notes

This version improves the end-to-end user journey without changing the core business purpose of the project.

## [v2.0.0] - 2026-03-21

### Summary
Second version of the Car Service Registration project that adds form submission handling and a basic service/repository layer.

### Highlights

- Added `CarRegistrationService` and `CarDAO` for in-memory registration processing.
- Updated the registration controller to bind form data and show a success page.
- Added a real registration JSP form and a success JSP.
- Expanded tests for controller submission, repository behavior, and service logic.
- Updated the README for the new registration flow.

### Notes

This version evolves the project from simple page navigation into a minimal working registration workflow.

## [v1.0.0] - 2026-03-21

### Summary
Initial version of the Car Service Registration project built as a Java 17 Spring Boot MVC application with JSP page navigation.

### Highlights

- Added welcome and registration page controllers for the MVC flow.
- Added a `Car` domain model implementing the `Vehicle` contract.
- Added route and domain tests for page navigation and vehicle-detail behavior.
- Cleaned project metadata and removed junk files before publishing.
- Added GitHub-ready documentation and changelog files.

### Notes

This version establishes the project as a compact Spring MVC starter for a car-service registration workflow.
