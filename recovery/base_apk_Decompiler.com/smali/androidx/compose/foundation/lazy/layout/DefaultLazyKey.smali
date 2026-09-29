###### Class androidx.compose.foundation.lazy.layout.DefaultLazyKey (androidx.compose.foundation.lazy.layout.DefaultLazyKey)
.class public final Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$read;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0082\u0008\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\rH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u000cJ\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;",
        "Landroid/os/Parcelable;",
        "",
        "p0",
        "<init>",
        "(I)V",
        "Landroid/os/Parcel;",
        "p1",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "describeContents",
        "()I",
        "",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "",
        "toString",
        "()Ljava/lang/String;",
        "RemoteActionCompatParcelizer",
        "I",
        "AudioAttributesCompatParcelizer",
        "read"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;",
            ">;"
        }
    .end annotation
.end field

.field public static final read:Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$read;


# instance fields
.field private final RemoteActionCompatParcelizer:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$read;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$read;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;->read:Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$read;

    .line 39
    new-instance v0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$write;

    invoke-direct {v0}, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$write;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(I)V
    .registers 2

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput p1, p0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;->RemoteActionCompatParcelizer:I

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    .line 41
    :cond_4
    instance-of v1, p1, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;

    iget p0, p0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;->RemoteActionCompatParcelizer:I

    iget p1, p1, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;->RemoteActionCompatParcelizer:I

    if-eq p0, p1, :cond_13

    return v2

    :cond_13
    return v0
.end method

.method public final hashCode()I
    .registers 1

    .line 42
    iget p0, p0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;->RemoteActionCompatParcelizer:I

    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    move-result p0

    return p0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DefaultLazyKey(AudioAttributesCompatParcelizer="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p0, p0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;->RemoteActionCompatParcelizer:I

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 28
    iget p0, p0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;->RemoteActionCompatParcelizer:I

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class androidx.compose.foundation.lazy.layout.DefaultLazyKey.Companion (androidx.compose.foundation.lazy.layout.DefaultLazyKey$read)
.class public final Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$read;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "read"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$read;",
        "",
        "<init>",
        "()V",
        "Landroid/os/Parcelable$Creator;",
        "Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;",
        "CREATOR",
        "Landroid/os/Parcelable$Creator;"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 36
    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$read;-><init>()V

    return-void
.end method

###### Class androidx.compose.foundation.lazy.layout.DefaultLazyKey.write (androidx.compose.foundation.lazy.layout.DefaultLazyKey$write)
.class public final Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$write;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0010\u0011\n\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\t"
    }
    d2 = {
        "Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$write;",
        "Landroid/os/Parcelable$Creator;",
        "Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;",
        "Landroid/os/Parcel;",
        "p0",
        "read",
        "(Landroid/os/Parcel;)Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;",
        "",
        "",
        "(I)[Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 39
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$write;->read(Landroid/os/Parcel;)Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 39
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$write;->read(I)[Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;

    move-result-object p0

    return-object p0
.end method

.method public final read(Landroid/os/Parcel;)Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;
    .registers 2

    .line 40
    new-instance p0, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;-><init>(I)V

    return-object p0
.end method

.method public final read(I)[Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;
    .registers 2

    .line 42
    new-array p0, p1, [Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;

    return-object p0
.end method
