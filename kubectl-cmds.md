# Kubectl commands i used in this project

- `kubectl apply -f k8s/` (applies all Kubernetes resources defined in the configuration files inside the k8s/ directory)
- `kubectl get pods` (list all pods in the default namespace)
- `kubectl describe pod <pod-name>` (shows detailed information about a specific pod)
- `kubectl logs <pod-name> -f` (shows the logs of a specific pod in real-time)
- `kubectl delete -f k8s/` (deletes all Kubernetes resources defined in the configuration files inside the k8s/ directory)

## Port Forwarding
- `kubectl port-forward pod/pod-name <local-port>:<container-port>` (forwards traffic from a local port to a port on a specific pod)

## Additional useful commands
- `kubectl get pods` (list all pods)
- `kubectl get svc` (list all services)
- `kubectl get all` (list all resources)
