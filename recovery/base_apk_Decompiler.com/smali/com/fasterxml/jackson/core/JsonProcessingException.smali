###### Class com.fasterxml.jackson.core.JsonProcessingException (com.fasterxml.jackson.core.JsonProcessingException)
.class public Lcom/fasterxml/jackson/core/JsonProcessingException;
.super Lcom/fasterxml/jackson/core/JacksonException;
.source "SourceFile"


# instance fields
.field public _location:Lcom/fasterxml/jackson/core/JsonLocation;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .registers 2

    .line 30
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/core/JacksonException;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonLocation;)V
    .registers 4

    const/4 v0, 0x0

    .line 34
    invoke-direct {p0, p1, p2, v0}, Lcom/fasterxml/jackson/core/JsonProcessingException;-><init>(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonLocation;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonLocation;Ljava/lang/Throwable;)V
    .registers 4

    .line 25
    invoke-direct {p0, p1, p3}, Lcom/fasterxml/jackson/core/JacksonException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 26
    iput-object p2, p0, Lcom/fasterxml/jackson/core/JsonProcessingException;->_location:Lcom/fasterxml/jackson/core/JsonLocation;

    return-void
.end method


# virtual methods
.method public getLocation()Lcom/fasterxml/jackson/core/JsonLocation;
    .registers 1

    .line 52
    iget-object p0, p0, Lcom/fasterxml/jackson/core/JsonProcessingException;->_location:Lcom/fasterxml/jackson/core/JsonLocation;

    return-object p0
.end method

.method public getMessage()Ljava/lang/String;
    .registers 5

    .line 120
    invoke-super {p0}, Lcom/fasterxml/jackson/core/JacksonException;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    .line 122
    const-string v0, "N/A"

    .line 124
    :cond_8
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JacksonException;->getLocation()Lcom/fasterxml/jackson/core/JsonLocation;

    move-result-object v1

    .line 125
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/JsonProcessingException;->getMessageSuffix()Ljava/lang/String;

    move-result-object p0

    if-nez v1, :cond_15

    if-nez p0, :cond_15

    return-object v0

    .line 128
    :cond_15
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x64

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 129
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p0, :cond_24

    .line 131
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_24
    if-eqz v1, :cond_32

    .line 134
    const-string p0, "\n at "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    :cond_32
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method protected getMessageSuffix()Ljava/lang/String;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public getOriginalMessage()Ljava/lang/String;
    .registers 1

    .line 73
    invoke-super {p0}, Lcom/fasterxml/jackson/core/JacksonException;->getMessage()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public getProcessor()Ljava/lang/Object;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    .line 143
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
