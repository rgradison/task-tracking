The -W flag in act -W .github/workflows/ci.yml tells act to run only the specified workflow file, instead of all workflows in the .github/workflows directory.

By default, act runs all workflows triggered by the event (e.g., push).
Using -W lets you target a specific workflow, which is useful for testing or debugging a single CI/CD pipeline.
Example:
act -W .github/workflows/ci.yml → runs only ci.yml, ignoring others.
This saves time and focuses execution on the workflow you're working on.

Finished
To test your ci.yml file locally using act:

Run the default workflow (triggers on push):
act

Run a specific event (e.g., pull_request):
act pull_request

Run only the ci.yml workflow:
act -W .github/workflows/ci.yml

Run a specific job (e.g., build):
act -j build

Test without executing steps (dry run):
act --dryrun

Ensure you're in your repository’s root directory where .github/workflows/ci.yml exists.
act uses Docker to simulate GitHub’s environment and executes the steps defined in your workflow.

why use kubectl apply -f k8s/deployment.yaml

kubectl apply -f k8s/deployment.yaml applies the configuration defined in deployment.yaml to create or update a Kubernetes resource.

If the Deployment doesn't exist, it will be created.
If it already exists, Kubernetes will update it by applying only the changes (declarative update).
It uses a three-way merge (current state, last applied config, and new config) to minimize disruptions.
The command is idempotent and safe to run multiple times.
This approach supports GitOps workflows and enables version-controlled, repeatable deployments.