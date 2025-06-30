System.out.println("Enter the value for n: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the value for array");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The given array is");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }