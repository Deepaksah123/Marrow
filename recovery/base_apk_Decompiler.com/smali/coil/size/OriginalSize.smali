###### Class coil.size.OriginalSize (coil.size.OriginalSize)
.class public final Lcoil/size/OriginalSize;
.super Lcoil/size/Size;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcoil/size/OriginalSize$read;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f"
    }
    d2 = {
        "Lcoil/size/OriginalSize;",
        "Lcoil/size/Size;",
        "<init>",
        "()V",
        "",
        "describeContents",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "Landroid/os/Parcel;",
        "p0",
        "p1",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V"
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
            "Lcoil/size/OriginalSize;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lcoil/size/OriginalSize;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 20
    new-instance v0, Lcoil/size/OriginalSize;

    invoke-direct {v0}, Lcoil/size/OriginalSize;-><init>()V

    sput-object v0, Lcoil/size/OriginalSize;->INSTANCE:Lcoil/size/OriginalSize;

    new-instance v0, Lcoil/size/OriginalSize$read;

    invoke-direct {v0}, Lcoil/size/OriginalSize$read;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcoil/size/OriginalSize;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    const/4 v0, 0x0

    .line 18
    invoke-direct {p0, v0}, Lcoil/size/Size;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final toString()Ljava/lang/String;
    .registers 1

    .line 19
    const-string p0, "coil.size.OriginalSize"

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    .line 22
    const-string p0, ""

    invoke-static {p1, p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

###### Class coil.size.OriginalSize.read (coil.size.OriginalSize$read)
.class public final Lcoil/size/OriginalSize$read;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcoil/size/OriginalSize;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "read"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcoil/size/OriginalSize;",
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

.method private static AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Lcoil/size/OriginalSize;
    .registers 2

    .line 2
    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/os/Parcel;->readInt()I

    sget-object p0, Lcoil/size/OriginalSize;->INSTANCE:Lcoil/size/OriginalSize;

    return-object p0
.end method

.method private static read(I)[Lcoil/size/OriginalSize;
    .registers 1

    .line 4
    new-array p0, p0, [Lcoil/size/OriginalSize;

    return-object p0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 3
    invoke-static {p1}, Lcoil/size/OriginalSize$read;->AudioAttributesCompatParcelizer(Landroid/os/Parcel;)Lcoil/size/OriginalSize;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 5
    invoke-static {p1}, Lcoil/size/OriginalSize$read;->read(I)[Lcoil/size/OriginalSize;

    move-result-object p0

    return-object p0
.end method
