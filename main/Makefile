
.PHONY: build
build: build
	./gradlew clean build

.PHONY: image # docker image 생성
image:
	docker build . -t advertisement:${VERSION}

.PHONY: upload # docker image 태그 설정 및 업로드
upload:
	docker tag advertisement:${VERSION} dltjdwls101/advertisement:${VERSION}
	docker push dltjdwls101/advertisement:${VERSION}

.PHONY: pull
pull:
	docker pull dltjdwls101/advertisement:${VERSION}

.PHONY: run
run:
	docker-compose -f ./docker-compose.yml up -d
