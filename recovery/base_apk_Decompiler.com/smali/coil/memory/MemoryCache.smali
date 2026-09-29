###### Class coil.memory.MemoryCache (coil.memory.MemoryCache)
.class public interface abstract Lcoil/memory/MemoryCache;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcoil/memory/MemoryCache$Key;
    }
.end annotation

###### Class coil.memory.MemoryCache.Key (coil.memory.MemoryCache$Key)
.class public abstract Lcoil/memory/MemoryCache$Key;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcoil/memory/MemoryCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Key"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcoil/memory/MemoryCache$Key$AudioAttributesCompatParcelizer;,
        Lcoil/memory/MemoryCache$Key$Complex;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\u00086\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0001\u0006"
    }
    d2 = {
        "Lcoil/memory/MemoryCache$Key;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "AudioAttributesCompatParcelizer",
        "Complex",
        "Lcoil/memory/MemoryCache$Key$Complex;"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final AudioAttributesCompatParcelizer:Lcoil/memory/MemoryCache$Key$AudioAttributesCompatParcelizer;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 41
    new-instance v0, Lcoil/memory/MemoryCache$Key$AudioAttributesCompatParcelizer;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcoil/memory/MemoryCache$Key$AudioAttributesCompatParcelizer;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Lcoil/memory/MemoryCache$Key;->AudioAttributesCompatParcelizer:Lcoil/memory/MemoryCache$Key$AudioAttributesCompatParcelizer;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 42
    invoke-direct {p0}, Lcoil/memory/MemoryCache$Key;-><init>()V

    return-void
.end method

###### Class coil.memory.MemoryCache.Key.Companion (coil.memory.MemoryCache$Key$AudioAttributesCompatParcelizer)
.class public final Lcoil/memory/MemoryCache$Key$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcoil/memory/MemoryCache$Key;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AudioAttributesCompatParcelizer"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lcoil/memory/MemoryCache$Key$AudioAttributesCompatParcelizer;",
        "",
        "<init>",
        "()V"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 43
    invoke-direct {p0}, Lcoil/memory/MemoryCache$Key$AudioAttributesCompatParcelizer;-><init>()V

    return-void
.end method

###### Class coil.memory.MemoryCache.Key.Complex (coil.memory.MemoryCache$Key$Complex)
.class public final Lcoil/memory/MemoryCache$Key$Complex;
.super Lcoil/memory/MemoryCache$Key;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcoil/memory/MemoryCache$Key;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Complex"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcoil/memory/MemoryCache$Key$Complex$AudioAttributesCompatParcelizer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u000c\u0008\u0080\u0008\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00028\u0006\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001d\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00088\u0006\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0007\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001e\u0010 R\u001a\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\""
    }
    d2 = {
        "Lcoil/memory/MemoryCache$Key$Complex;",
        "Lcoil/memory/MemoryCache$Key;",
        "",
        "p0",
        "",
        "p1",
        "Lcoil/size/Size;",
        "p2",
        "",
        "p3",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcoil/size/Size;Ljava/util/Map;)V",
        "",
        "describeContents",
        "()I",
        "",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "toString",
        "()Ljava/lang/String;",
        "Landroid/os/Parcel;",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "RemoteActionCompatParcelizer",
        "Ljava/lang/String;",
        "read",
        "Ljava/util/Map;",
        "write",
        "Lcoil/size/Size;",
        "()Lcoil/size/Size;",
        "IconCompatParcelizer",
        "Ljava/util/List;",
        "AudioAttributesCompatParcelizer"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcoil/memory/MemoryCache$Key$Complex;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final IconCompatParcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final RemoteActionCompatParcelizer:Ljava/lang/String;

.field private final read:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final write:Lcoil/size/Size;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 69
    new-instance v0, Lcoil/memory/MemoryCache$Key$Complex$AudioAttributesCompatParcelizer;

    invoke-direct {v0}, Lcoil/memory/MemoryCache$Key$Complex$AudioAttributesCompatParcelizer;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcoil/memory/MemoryCache$Key$Complex;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcoil/size/Size;Ljava/util/Map;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcoil/size/Size;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 68
    invoke-direct {p0, v0}, Lcoil/memory/MemoryCache$Key;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    .line 64
    iput-object p1, p0, Lcoil/memory/MemoryCache$Key$Complex;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 65
    iput-object p2, p0, Lcoil/memory/MemoryCache$Key$Complex;->IconCompatParcelizer:Ljava/util/List;

    .line 66
    iput-object p3, p0, Lcoil/memory/MemoryCache$Key$Complex;->write:Lcoil/size/Size;

    .line 67
    iput-object p4, p0, Lcoil/memory/MemoryCache$Key$Complex;->read:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    .line 71
    :cond_4
    instance-of v1, p1, Lcoil/memory/MemoryCache$Key$Complex;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcoil/memory/MemoryCache$Key$Complex;

    iget-object v1, p0, Lcoil/memory/MemoryCache$Key$Complex;->RemoteActionCompatParcelizer:Ljava/lang/String;

    iget-object v3, p1, Lcoil/memory/MemoryCache$Key$Complex;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcoil/memory/MemoryCache$Key$Complex;->IconCompatParcelizer:Ljava/util/List;

    iget-object v3, p1, Lcoil/memory/MemoryCache$Key$Complex;->IconCompatParcelizer:Ljava/util/List;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    return v2

    :cond_22
    iget-object v1, p0, Lcoil/memory/MemoryCache$Key$Complex;->write:Lcoil/size/Size;

    iget-object v3, p1, Lcoil/memory/MemoryCache$Key$Complex;->write:Lcoil/size/Size;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    return v2

    :cond_2d
    iget-object p0, p0, Lcoil/memory/MemoryCache$Key$Complex;->read:Ljava/util/Map;

    iget-object p1, p1, Lcoil/memory/MemoryCache$Key$Complex;->read:Ljava/util/Map;

    invoke-static {p0, p1}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_38

    return v2

    :cond_38
    return v0
.end method

.method public final hashCode()I
    .registers 4

    .line 72
    iget-object v0, p0, Lcoil/memory/MemoryCache$Key$Complex;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcoil/memory/MemoryCache$Key$Complex;->IconCompatParcelizer:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    iget-object v2, p0, Lcoil/memory/MemoryCache$Key$Complex;->write:Lcoil/size/Size;

    if-nez v2, :cond_12

    const/4 v2, 0x0

    goto :goto_16

    :cond_12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_16
    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Lcoil/memory/MemoryCache$Key$Complex;->read:Ljava/util/Map;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Complex(RemoteActionCompatParcelizer="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcoil/memory/MemoryCache$Key$Complex;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", AudioAttributesCompatParcelizer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcoil/memory/MemoryCache$Key$Complex;->IconCompatParcelizer:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", write="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcoil/memory/MemoryCache$Key$Complex;->write:Lcoil/size/Size;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", read="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lcoil/memory/MemoryCache$Key$Complex;->read:Ljava/util/Map;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final write()Lcoil/size/Size;
    .registers 1

    .line 66
    iget-object p0, p0, Lcoil/memory/MemoryCache$Key$Complex;->write:Lcoil/size/Size;

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 4

    .line 74
    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcoil/memory/MemoryCache$Key$Complex;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcoil/memory/MemoryCache$Key$Complex;->IconCompatParcelizer:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    iget-object v0, p0, Lcoil/memory/MemoryCache$Key$Complex;->write:Lcoil/size/Size;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object p0, p0, Lcoil/memory/MemoryCache$Key$Complex;->read:Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_27
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_46

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_27

    :cond_46
    return-void
.end method

###### Class coil.memory.MemoryCache.Key.Complex.AudioAttributesCompatParcelizer (coil.memory.MemoryCache$Key$Complex$AudioAttributesCompatParcelizer)
.class public final Lcoil/memory/MemoryCache$Key$Complex$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcoil/memory/MemoryCache$Key$Complex;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AudioAttributesCompatParcelizer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcoil/memory/MemoryCache$Key$Complex;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(I)[Lcoil/memory/MemoryCache$Key$Complex;
    .registers 1

    .line 4
    new-array p0, p0, [Lcoil/memory/MemoryCache$Key$Complex;

    return-object p0
.end method

.method private static RemoteActionCompatParcelizer(Landroid/os/Parcel;)Lcoil/memory/MemoryCache$Key$Complex;
    .registers 9

    .line 2
    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    const-class v2, Lcoil/memory/MemoryCache$Key$Complex;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Lcoil/size/Size;

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    const/4 v5, 0x0

    :goto_25
    if-eq v5, v3, :cond_35

    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v6, v7}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_25

    :cond_35
    new-instance p0, Lcoil/memory/MemoryCache$Key$Complex;

    check-cast v4, Ljava/util/Map;

    invoke-direct {p0, v0, v1, v2, v4}, Lcoil/memory/MemoryCache$Key$Complex;-><init>(Ljava/lang/String;Ljava/util/List;Lcoil/size/Size;Ljava/util/Map;)V

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 3
    invoke-static {p1}, Lcoil/memory/MemoryCache$Key$Complex$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/os/Parcel;)Lcoil/memory/MemoryCache$Key$Complex;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 5
    invoke-static {p1}, Lcoil/memory/MemoryCache$Key$Complex$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(I)[Lcoil/memory/MemoryCache$Key$Complex;

    move-result-object p0

    return-object p0
.end method
