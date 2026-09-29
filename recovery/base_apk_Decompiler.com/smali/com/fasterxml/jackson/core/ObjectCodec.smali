###### Class com.fasterxml.jackson.core.ObjectCodec (com.fasterxml.jackson.core.ObjectCodec)
.class public abstract Lcom/fasterxml/jackson/core/ObjectCodec;
.super Lcom/fasterxml/jackson/core/TreeCodec;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 27
    invoke-direct {p0}, Lcom/fasterxml/jackson/core/TreeCodec;-><init>()V

    return-void
.end method


# virtual methods
.method public getFactory()Lcom/fasterxml/jackson/core/JsonFactory;
    .registers 1

    .line 278
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/ObjectCodec;->getJsonFactory()Lcom/fasterxml/jackson/core/JsonFactory;

    move-result-object p0

    return-object p0
.end method

.method public getJsonFactory()Lcom/fasterxml/jackson/core/JsonFactory;
    .registers 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 270
    invoke-virtual {p0}, Lcom/fasterxml/jackson/core/ObjectCodec;->getFactory()Lcom/fasterxml/jackson/core/JsonFactory;

    move-result-object p0

    return-object p0
.end method

.method public abstract readTree(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/fasterxml/jackson/core/TreeNode;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/fasterxml/jackson/core/TreeNode;",
            ">(",
            "Lcom/fasterxml/jackson/core/JsonParser;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract writeValue(Lcom/fasterxml/jackson/core/JsonGenerator;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
