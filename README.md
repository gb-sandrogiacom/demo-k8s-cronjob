# Demo k8s, cronjob and Spring Boot

## **Create a cronjob in k8s to run a Spring Boot application.**

## References

https://kubernetes.io/docs/concepts/workloads/controllers/cron-jobs/

https://kubernetes.io/docs/tasks/job/automated-tasks-with-cron-jobs/

https://medium.com/@sivaramansankar2019/k8s-cron-job-for-java-batch-processing-436abbb316bc

https://github.com/sivaramanArch/reportingService


## Create docker image

Build:

```bash
 docker build -t demo-k8s-cronjob .
```

Run container:

```bash
docker run --name demo-cronjob -it demo-k8s-cronjob
```

## Create k8s cronjob

```bash
kubectl apply -f k8s/demo.yaml
```

## Check cronjob

```bash
kubectl get cronjob
```

## For continuous monitoring
    
```bash
kubectl get jobs --watch
```

## Check logs

```bash
kubectl get pods | grep demo-job
```

```bash
kubectl logs -f <pod-name>
```

## Delete cronjob

```bash
kubectl delete -f k8s/demo.yaml
```
