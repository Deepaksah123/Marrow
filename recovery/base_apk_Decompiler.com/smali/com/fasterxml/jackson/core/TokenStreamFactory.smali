###### Class com.fasterxml.jackson.core.TokenStreamFactory (com.fasterxml.jackson.core.TokenStreamFactory)
.class public abstract Lcom/fasterxml/jackson/core/TokenStreamFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static IconCompatParcelizer:I

.field public static write:I


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static IconCompatParcelizer()I
    .registers 3

    .line 350
    sget v0, Lcom/fasterxml/jackson/core/TokenStreamFactory;->write:I

    const v1, 0x6b672a

    rem-int v1, v0, v1

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/fasterxml/jackson/core/TokenStreamFactory;->write:I

    if-eqz v1, :cond_10

    sget v0, Lcom/fasterxml/jackson/core/TokenStreamFactory;->IconCompatParcelizer:I

    return v0

    :cond_10
    const-string v0, "android.app.ActivityThread"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    const-string v2, "currentApplication"

    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    move-object v2, v1

    check-cast v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    sput v0, Lcom/fasterxml/jackson/core/TokenStreamFactory;->IconCompatParcelizer:I

    return v0
.end method


# virtual methods
.method protected _checkRangeBoundsForByteArray([BII)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    if-nez p1, :cond_7

    .line 308
    const-string v0, "Invalid `byte[]` argument: `null`"

    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/core/TokenStreamFactory;->_reportRangeError(Ljava/lang/String;)Ljava/lang/Object;

    .line 310
    :cond_7
    array-length p1, p1

    add-int v0, p2, p3

    sub-int v1, p1, v0

    or-int v2, p2, p3

    or-int/2addr v0, v2

    or-int/2addr v0, v1

    if-gez v0, :cond_2b

    .line 325
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p2, p3, p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 323
    const-string p2, "Invalid \'offset\' (%d) and/or \'len\' (%d) arguments for `byte[]` of length %d"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/core/TokenStreamFactory;->_reportRangeError(Ljava/lang/String;)Ljava/lang/Object;

    :cond_2b
    return-void
.end method

.method protected _reportRangeError(Ljava/lang/String;)Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 349
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
