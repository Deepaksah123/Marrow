###### Class com.fasterxml.jackson.databind.introspect.AnnotatedField (com.fasterxml.jackson.databind.introspect.AnnotatedField)
.class public final Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;
.super Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/introspect/AnnotatedField$Serialization;
    }
.end annotation


# instance fields
.field protected final transient _field:Ljava/lang/reflect/Field;

.field protected _serialization:Lcom/fasterxml/jackson/databind/introspect/AnnotatedField$Serialization;


# direct methods
.method protected constructor <init>(Lcom/fasterxml/jackson/databind/introspect/AnnotatedField$Serialization;)V
    .registers 3

    const/4 v0, 0x0

    .line 53
    invoke-direct {p0, v0, v0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;-><init>(Lcom/fasterxml/jackson/databind/introspect/TypeResolutionContext;Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;)V

    .line 54
    iput-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_field:Ljava/lang/reflect/Field;

    .line 55
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_serialization:Lcom/fasterxml/jackson/databind/introspect/AnnotatedField$Serialization;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/introspect/TypeResolutionContext;Ljava/lang/reflect/Field;Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;)V
    .registers 4

    .line 39
    invoke-direct {p0, p1, p3}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;-><init>(Lcom/fasterxml/jackson/databind/introspect/TypeResolutionContext;Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;)V

    .line 40
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_field:Ljava/lang/reflect/Field;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .registers 5

    const/4 v0, 0x1

    if-ne p1, p0, :cond_4

    return v0

    .line 138
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->hasClass(Ljava/lang/Object;Ljava/lang/Class;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_10

    return v2

    .line 142
    :cond_10
    check-cast p1, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;

    .line 143
    iget-object p1, p1, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_field:Ljava/lang/reflect/Field;

    if-nez p1, :cond_1c

    .line 144
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_field:Ljava/lang/reflect/Field;

    if-nez p0, :cond_1b

    return v0

    :cond_1b
    return v2

    .line 146
    :cond_1c
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_field:Ljava/lang/reflect/Field;

    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public final bridge synthetic getAnnotated()Ljava/lang/reflect/AnnotatedElement;
    .registers 1

    .line 12
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->getAnnotated()Ljava/lang/reflect/Field;

    move-result-object p0

    return-object p0
.end method

.method public final getAnnotated()Ljava/lang/reflect/Field;
    .registers 1

    .line 65
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_field:Ljava/lang/reflect/Field;

    return-object p0
.end method

.method public final getDeclaringClass()Ljava/lang/Class;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 90
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_field:Ljava/lang/reflect/Field;

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method

.method public final getMember()Ljava/lang/reflect/Member;
    .registers 1

    .line 93
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_field:Ljava/lang/reflect/Field;

    return-object p0
.end method

.method public final getModifiers()I
    .registers 1

    .line 68
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_field:Ljava/lang/reflect/Field;

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result p0

    return p0
.end method

.method public final getName()Ljava/lang/String;
    .registers 1

    .line 71
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_field:Ljava/lang/reflect/Field;

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final getRawType()Ljava/lang/Class;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 75
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_field:Ljava/lang/reflect/Field;

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method

.method public final getType()Lcom/fasterxml/jackson/databind/JavaType;
    .registers 2

    .line 80
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->_typeContext:Lcom/fasterxml/jackson/databind/introspect/TypeResolutionContext;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_field:Ljava/lang/reflect/Field;

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object p0

    invoke-interface {v0, p0}, Lcom/fasterxml/jackson/databind/introspect/TypeResolutionContext;->resolveType(Ljava/lang/reflect/Type;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p0

    return-object p0
.end method

.method public final getValue(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 110
    :try_start_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_field:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_6
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_6} :catch_7

    return-object p0

    :catch_7
    move-exception p1

    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to getValue() for field "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->getFullName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ": "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final hashCode()I
    .registers 1

    .line 132
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_field:Ljava/lang/reflect/Field;

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0
.end method

.method public final isTransient()Z
    .registers 1

    .line 128
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->getModifiers()I

    move-result p0

    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    move-result p0

    return p0
.end method

.method final readResolve()Ljava/lang/Object;
    .registers 5

    .line 166
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_serialization:Lcom/fasterxml/jackson/databind/introspect/AnnotatedField$Serialization;

    iget-object v0, v0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField$Serialization;->clazz:Ljava/lang/Class;

    .line 168
    :try_start_4
    iget-object v1, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_serialization:Lcom/fasterxml/jackson/databind/introspect/AnnotatedField$Serialization;

    iget-object v1, v1, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField$Serialization;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    .line 170
    invoke-virtual {v1}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    move-result v2

    if-nez v2, :cond_16

    const/4 v2, 0x0

    .line 171
    invoke-static {v1, v2}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->checkAndFixAccess(Ljava/lang/reflect/Member;Z)V

    .line 173
    :cond_16
    new-instance v2, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v1, v3}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;-><init>(Lcom/fasterxml/jackson/databind/introspect/TypeResolutionContext;Ljava/lang/reflect/Field;Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;)V
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_1c} :catch_1d

    return-object v2

    .line 175
    :catch_1d
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Could not find method \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_serialization:Lcom/fasterxml/jackson/databind/introspect/AnnotatedField$Serialization;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField$Serialization;->name:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\' from Class \'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final setValue(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 99
    :try_start_0
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_field:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_5} :catch_6

    return-void

    :catch_6
    move-exception p1

    .line 101
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Failed to setValue() for field "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->getFullName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ": "

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 152
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[field "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->getFullName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final bridge synthetic withAnnotations(Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;)Lcom/fasterxml/jackson/databind/introspect/Annotated;
    .registers 2

    .line 12
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->withAnnotations(Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;

    move-result-object p0

    return-object p0
.end method

.method public final withAnnotations(Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;)Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;
    .registers 4

    .line 45
    new-instance v0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;

    iget-object v1, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->_typeContext:Lcom/fasterxml/jackson/databind/introspect/TypeResolutionContext;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_field:Ljava/lang/reflect/Field;

    invoke-direct {v0, v1, p0, p1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;-><init>(Lcom/fasterxml/jackson/databind/introspect/TypeResolutionContext;Ljava/lang/reflect/Field;Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;)V

    return-object v0
.end method

.method final writeReplace()Ljava/lang/Object;
    .registers 3

    .line 162
    new-instance v0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;

    new-instance v1, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField$Serialization;

    iget-object p0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;->_field:Ljava/lang/reflect/Field;

    invoke-direct {v1, p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField$Serialization;-><init>(Ljava/lang/reflect/Field;)V

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;-><init>(Lcom/fasterxml/jackson/databind/introspect/AnnotatedField$Serialization;)V

    return-object v0
.end method

###### Class com.fasterxml.jackson.databind.introspect.AnnotatedField.Serialization (com.fasterxml.jackson.databind.introspect.AnnotatedField$Serialization)
.class public final Lcom/fasterxml/jackson/databind/introspect/AnnotatedField$Serialization;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Serialization"
.end annotation


# static fields
.field public static RemoteActionCompatParcelizer:I

.field public static read:I


# instance fields
.field protected clazz:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field protected name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .registers 3

    .line 192
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 193
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField$Serialization;->clazz:Ljava/lang/Class;

    .line 194
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField$Serialization;->name:Ljava/lang/String;

    return-void
.end method

.method public static read()I
    .registers 2

    .line 195
    sget v0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField$Serialization;->read:I

    const v1, 0x69aaad

    rem-int v1, v0, v1

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField$Serialization;->read:I

    if-eqz v1, :cond_10

    sget v0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField$Serialization;->RemoteActionCompatParcelizer:I

    return v0

    :cond_10
    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v0

    sput v0, Lcom/fasterxml/jackson/databind/introspect/AnnotatedField$Serialization;->RemoteActionCompatParcelizer:I

    return v0
.end method
