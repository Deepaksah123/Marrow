###### Class com.fasterxml.jackson.core.exc.StreamWriteException (com.fasterxml.jackson.core.exc.StreamWriteException)
.class public abstract Lcom/fasterxml/jackson/core/exc/StreamWriteException;
.super Lcom/fasterxml/jackson/core/JsonProcessingException;
.source "SourceFile"


# instance fields
.field public transient _processor:Lcom/fasterxml/jackson/core/JsonGenerator;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonGenerator;)V
    .registers 4

    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, p1, v0}, Lcom/fasterxml/jackson/core/JsonProcessingException;-><init>(Ljava/lang/String;Lcom/fasterxml/jackson/core/JsonLocation;)V

    .line 27
    iput-object p2, p0, Lcom/fasterxml/jackson/core/exc/StreamWriteException;->_processor:Lcom/fasterxml/jackson/core/JsonGenerator;

    return-void
.end method


# virtual methods
.method public getProcessor()Lcom/fasterxml/jackson/core/JsonGenerator;
    .registers 1

    .line 46
    iget-object p0, p0, Lcom/fasterxml/jackson/core/exc/StreamWriteException;->_processor:Lcom/fasterxml/jackson/core/JsonGenerator;

    return-object p0
.end method

.method public bridge synthetic getProcessor()Ljava/lang/Object;
    .registers 1

    .line 13
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/exc/StreamWriteException;->getProcessor()Lcom/fasterxml/jackson/core/JsonGenerator;

    move-result-object p0

    return-object p0
.end method
