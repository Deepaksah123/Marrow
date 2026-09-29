###### Class com.fasterxml.jackson.databind.node.NodeSerialization (com.fasterxml.jackson.databind.node.NodeSerialization)
.class Lcom/fasterxml/jackson/databind/node/NodeSerialization;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/io/Externalizable;


# instance fields
.field public json:[B


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>([B)V
    .registers 2

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/node/NodeSerialization;->json:[B

    return-void
.end method

.method private _read(Ljava/io/ObjectInput;I)[B
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p0, 0x0

    const v0, 0x186a0

    if-gt p2, v0, :cond_c

    .line 59
    new-array v0, p2, [B

    .line 60
    invoke-interface {p1, v0, p0, p2}, Ljava/io/ObjectInput;->readFully([BII)V

    return-object v0

    .line 65
    :cond_c
    new-instance v1, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;

    invoke-direct {v1, v0}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;-><init>(I)V

    .line 66
    :try_start_11
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->resetAndGetFirstSegment()[B

    move-result-object v0

    :goto_15
    move v2, p0

    .line 69
    :cond_16
    array-length v3, v0

    sub-int/2addr v3, v2

    invoke-static {v3, p2}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 70
    invoke-interface {p1, v0, p0, v3}, Ljava/io/ObjectInput;->readFully([BII)V

    sub-int/2addr p2, v3

    add-int/2addr v2, v3

    if-nez p2, :cond_2b

    .line 75
    invoke-virtual {v1, v2}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->completeAndCoalesce(I)[B

    move-result-object p0
    :try_end_27
    .catchall {:try_start_11 .. :try_end_27} :catchall_33

    .line 83
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    return-object p0

    .line 78
    :cond_2b
    :try_start_2b
    array-length v3, v0

    if-ne v2, v3, :cond_16

    .line 79
    invoke-virtual {v1}, Lcom/fasterxml/jackson/core/util/ByteArrayBuilder;->finishCurrentSegment()[B

    move-result-object v0
    :try_end_32
    .catchall {:try_start_2b .. :try_end_32} :catchall_33

    goto :goto_15

    :catchall_33
    move-exception p0

    .line 65
    :try_start_34
    throw p0
    :try_end_35
    .catchall {:try_start_34 .. :try_end_35} :catchall_35

    :catchall_35
    move-exception p1

    .line 83
    :try_start_36
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_39
    .catchall {:try_start_36 .. :try_end_39} :catchall_3a

    goto :goto_3e

    :catchall_3a
    move-exception p2

    invoke-virtual {p0, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3e
    throw p1
.end method

.method public static from(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/node/NodeSerialization;
    .registers 5

    .line 38
    :try_start_0
    new-instance v0, Lcom/fasterxml/jackson/databind/node/NodeSerialization;

    invoke-static {p0}, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper;->valueToBytes(Ljava/lang/Object;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/NodeSerialization;-><init>([B)V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_9} :catch_a

    return-object v0

    :catch_a
    move-exception v0

    .line 40
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to JDK serialize `"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "` value: "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public readExternal(Ljava/io/ObjectInput;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 52
    invoke-interface {p1}, Ljava/io/ObjectInput;->readInt()I

    move-result v0

    .line 53
    invoke-direct {p0, p1, v0}, Lcom/fasterxml/jackson/databind/node/NodeSerialization;->_read(Ljava/io/ObjectInput;I)[B

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/node/NodeSerialization;->json:[B

    return-void
.end method

.method protected readResolve()Ljava/lang/Object;
    .registers 4

    .line 30
    :try_start_0
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/NodeSerialization;->json:[B

    invoke-static {p0}, Lcom/fasterxml/jackson/databind/node/InternalNodeMapper;->bytesToNode([B)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_6} :catch_7

    return-object p0

    :catch_7
    move-exception p0

    .line 32
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to JDK deserialize `JsonNode` value: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public writeExternal(Ljava/io/ObjectOutput;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 46
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/node/NodeSerialization;->json:[B

    array-length v0, v0

    invoke-interface {p1, v0}, Ljava/io/ObjectOutput;->writeInt(I)V

    .line 47
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/node/NodeSerialization;->json:[B

    invoke-interface {p1, p0}, Ljava/io/ObjectOutput;->write([B)V

    return-void
.end method
