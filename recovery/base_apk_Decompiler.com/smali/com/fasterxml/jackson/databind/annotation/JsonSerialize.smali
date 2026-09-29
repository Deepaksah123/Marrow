###### Class com.fasterxml.jackson.databind.annotation.JsonSerialize (com.fasterxml.jackson.databind.annotation.JsonSerialize)
.class public interface abstract annotation Lcom/fasterxml/jackson/databind/annotation/JsonSerialize;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lcom/fasterxml/jackson/databind/annotation/JsonSerialize;
        as = Ljava/lang/Void;
        contentAs = Ljava/lang/Void;
        contentConverter = Lcom/fasterxml/jackson/databind/util/Converter$None;
        contentUsing = Lcom/fasterxml/jackson/databind/JsonSerializer$None;
        converter = Lcom/fasterxml/jackson/databind/util/Converter$None;
        include = .enum Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;->DEFAULT_INCLUSION:Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;
        keyAs = Ljava/lang/Void;
        keyUsing = Lcom/fasterxml/jackson/databind/JsonSerializer$None;
        nullsUsing = Lcom/fasterxml/jackson/databind/JsonSerializer$None;
        typing = .enum Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;->DEFAULT_TYPING:Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;
        using = Lcom/fasterxml/jackson/databind/JsonSerializer$None;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;,
        Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;
    }
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->RUNTIME:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->ANNOTATION_TYPE:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->FIELD:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->PARAMETER:Ljava/lang/annotation/ElementType;
    }
.end annotation


# virtual methods
.method public abstract as()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract contentAs()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract contentConverter()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/fasterxml/jackson/databind/util/Converter;",
            ">;"
        }
    .end annotation
.end method

.method public abstract contentUsing()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/fasterxml/jackson/databind/JsonSerializer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract converter()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/fasterxml/jackson/databind/util/Converter;",
            ">;"
        }
    .end annotation
.end method

.method public abstract include()Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract keyAs()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract keyUsing()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/fasterxml/jackson/databind/JsonSerializer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract nullsUsing()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/fasterxml/jackson/databind/JsonSerializer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract typing()Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;
.end method

.method public abstract using()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/fasterxml/jackson/databind/JsonSerializer;",
            ">;"
        }
    .end annotation
.end method

###### Class com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion (com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion)
.class public final enum Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/annotation/JsonSerialize;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Inclusion"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;",
        ">;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

.field public static final enum ALWAYS:Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

.field public static final enum DEFAULT_INCLUSION:Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

.field public static final enum NON_DEFAULT:Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

.field public static final enum NON_EMPTY:Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

.field public static final enum NON_NULL:Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;


# direct methods
.method static constructor <clinit>()V
    .registers 7

    .line 199
    new-instance v0, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

    const-string v1, "ALWAYS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;->ALWAYS:Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

    .line 205
    new-instance v1, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

    const-string v2, "NON_NULL"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;->NON_NULL:Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

    .line 215
    new-instance v2, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

    const-string v3, "NON_DEFAULT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;->NON_DEFAULT:Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

    .line 234
    new-instance v3, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

    const-string v4, "NON_EMPTY"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5}, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;->NON_EMPTY:Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

    .line 242
    new-instance v4, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

    const-string v5, "DEFAULT_INCLUSION"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6}, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;->DEFAULT_INCLUSION:Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

    .line 192
    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;->$VALUES:[Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 193
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;
    .registers 2

    .line 192
    const-class v0, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

    return-object p0
.end method

.method public static values()[Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;
    .registers 1

    .line 192
    sget-object v0, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;->$VALUES:[Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

    invoke-virtual {v0}, [Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Inclusion;

    return-object v0
.end method

###### Class com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing (com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing)
.class public final enum Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/annotation/JsonSerialize;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Typing"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;

.field public static final enum DEFAULT_TYPING:Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;

.field public static final enum DYNAMIC:Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;

.field public static final enum STATIC:Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;


# direct methods
.method static constructor <clinit>()V
    .registers 5

    .line 257
    new-instance v0, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;

    const-string v1, "DYNAMIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;->DYNAMIC:Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;

    .line 263
    new-instance v1, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;

    const-string v2, "STATIC"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;->STATIC:Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;

    .line 271
    new-instance v2, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;

    const-string v3, "DEFAULT_TYPING"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;->DEFAULT_TYPING:Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;

    .line 251
    filled-new-array {v0, v1, v2}, [Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;

    move-result-object v0

    sput-object v0, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;->$VALUES:[Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 251
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;
    .registers 2

    .line 251
    const-class v0, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;

    return-object p0
.end method

.method public static values()[Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;
    .registers 1

    .line 251
    sget-object v0, Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;->$VALUES:[Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;

    invoke-virtual {v0}, [Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/databind/annotation/JsonSerialize$Typing;

    return-object v0
.end method
