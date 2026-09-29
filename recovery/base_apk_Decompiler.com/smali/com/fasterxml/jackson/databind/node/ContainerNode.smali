###### Class com.fasterxml.jackson.databind.node.ContainerNode (com.fasterxml.jackson.databind.node.ContainerNode)
.class public abstract Lcom/fasterxml/jackson/databind/node/ContainerNode;
.super Lcom/fasterxml/jackson/databind/node/BaseJsonNode;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/fasterxml/jackson/databind/node/ContainerNode<",
        "TT;>;>",
        "Lcom/fasterxml/jackson/databind/node/BaseJsonNode;"
    }
.end annotation


# instance fields
.field protected final _nodeFactory:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;


# direct methods
.method protected constructor <init>()V
    .registers 2

    .line 32
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/node/BaseJsonNode;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/node/ContainerNode;->_nodeFactory:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V
    .registers 2

    .line 28
    invoke-direct {p0}, Lcom/fasterxml/jackson/databind/node/BaseJsonNode;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/node/ContainerNode;->_nodeFactory:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    return-void
.end method


# virtual methods
.method public final arrayNode()Lcom/fasterxml/jackson/databind/node/ArrayNode;
    .registers 1

    .line 90
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/ContainerNode;->_nodeFactory:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->arrayNode()Lcom/fasterxml/jackson/databind/node/ArrayNode;

    move-result-object p0

    return-object p0
.end method

.method public asText()Ljava/lang/String;
    .registers 1

    .line 41
    const-string p0, ""

    return-object p0
.end method

.method public final booleanNode(Z)Lcom/fasterxml/jackson/databind/node/BooleanNode;
    .registers 2

    .line 70
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/ContainerNode;->_nodeFactory:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->booleanNode(Z)Lcom/fasterxml/jackson/databind/node/BooleanNode;

    move-result-object p0

    return-object p0
.end method

.method public final nullNode()Lcom/fasterxml/jackson/databind/node/NullNode;
    .registers 1

    .line 77
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/ContainerNode;->_nodeFactory:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->nullNode()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object p0

    return-object p0
.end method

.method public final objectNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;
    .registers 1

    .line 105
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/ContainerNode;->_nodeFactory:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->objectNode()Lcom/fasterxml/jackson/databind/node/ObjectNode;

    move-result-object p0

    return-object p0
.end method

.method public final textNode(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/TextNode;
    .registers 2

    .line 143
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/ContainerNode;->_nodeFactory:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->textNode(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/TextNode;

    move-result-object p0

    return-object p0
.end method
