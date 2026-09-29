###### Class com.fasterxml.jackson.databind.introspect.MemberKey (com.fasterxml.jackson.databind.introspect.MemberKey)
.class public final Lcom/fasterxml/jackson/databind/introspect/MemberKey;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final NO_CLASSES:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# instance fields
.field final _argTypes:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field final _name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const/4 v0, 0x0

    .line 13
    new-array v0, v0, [Ljava/lang/Class;

    sput-object v0, Lcom/fasterxml/jackson/databind/introspect/MemberKey;->NO_CLASSES:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/lang/Class;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/MemberKey;->_name:Ljava/lang/String;

    if-nez p2, :cond_9

    .line 31
    sget-object p2, Lcom/fasterxml/jackson/databind/introspect/MemberKey;->NO_CLASSES:[Ljava/lang/Class;

    :cond_9
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/introspect/MemberKey;->_argTypes:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Constructor;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)V"
        }
    .end annotation

    .line 25
    const-string v0, ""

    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/fasterxml/jackson/databind/introspect/MemberKey;-><init>(Ljava/lang/String;[Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .registers 3

    .line 20
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/fasterxml/jackson/databind/introspect/MemberKey;-><init>(Ljava/lang/String;[Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final argCount()I
    .registers 1

    .line 39
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/MemberKey;->_argTypes:[Ljava/lang/Class;

    array-length p0, p0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 8

    const/4 v0, 0x1

    if-ne p1, p0, :cond_4

    return v0

    :cond_4
    const/4 v1, 0x0

    if-nez p1, :cond_8

    return v1

    .line 57
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_13

    return v1

    .line 60
    :cond_13
    check-cast p1, Lcom/fasterxml/jackson/databind/introspect/MemberKey;

    .line 61
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/introspect/MemberKey;->_name:Ljava/lang/String;

    iget-object v3, p1, Lcom/fasterxml/jackson/databind/introspect/MemberKey;->_name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_20

    return v1

    .line 64
    :cond_20
    iget-object p1, p1, Lcom/fasterxml/jackson/databind/introspect/MemberKey;->_argTypes:[Ljava/lang/Class;

    .line 65
    iget-object v2, p0, Lcom/fasterxml/jackson/databind/introspect/MemberKey;->_argTypes:[Ljava/lang/Class;

    array-length v2, v2

    .line 66
    array-length v3, p1

    if-eq v3, v2, :cond_29

    return v1

    :cond_29
    move v3, v1

    :goto_2a
    if-ge v3, v2, :cond_38

    .line 70
    aget-object v4, p1, v3

    .line 71
    iget-object v5, p0, Lcom/fasterxml/jackson/databind/introspect/MemberKey;->_argTypes:[Ljava/lang/Class;

    aget-object v5, v5, v3

    if-ne v4, v5, :cond_37

    add-int/lit8 v3, v3, 0x1

    goto :goto_2a

    :cond_37
    return v1

    :cond_38
    return v0
.end method

.method public final getName()Ljava/lang/String;
    .registers 1

    .line 35
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/MemberKey;->_name:Ljava/lang/String;

    return-object p0
.end method

.method public final hashCode()I
    .registers 2

    .line 49
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/MemberKey;->_name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/MemberKey;->_argTypes:[Ljava/lang/Class;

    array-length p0, p0

    add-int/2addr v0, p0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/introspect/MemberKey;->_name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/MemberKey;->_argTypes:[Ljava/lang/Class;

    array-length p0, p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "-args)"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
